package es.domingojunta.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"es.domingojunta"},excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages={"es.domingojunta.repositories"})
public class RootConfig {

	@Bean
	public DataSource dataSource() {
		
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).build();
	}
	
	@ Bean
	public JpaVendorAdapter adapter(){
		
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		//adapter.setDatabase("HSQL");
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false);
		adapter.setDatabasePlatform("org.hibernate.dialect.HSQLDialect");
		return adapter;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory (DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
		LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
		emfb.setDataSource(dataSource);
		emfb.setJpaVendorAdapter(jpaVendorAdapter);
		emfb.setJpaProperties(additionalProperties());
		emfb.setPackagesToScan("es.domingojunta.entities");
		return emfb;
		
	}
	
	private Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}

	@Bean 
	public PlatformTransactionManager transactionManager() {
		
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory(dataSource(), adapter()).getObject() );
		return jpaTransactionManager;
			}
	
	}
