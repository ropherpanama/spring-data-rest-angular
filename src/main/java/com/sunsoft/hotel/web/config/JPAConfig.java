package com.sunsoft.hotel.web.config;

import javax.sql.DataSource;

//import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sunsoft.hotel.config.GeneralConfig;

@Configuration
@EnableJpaRepositories("com.sunsoft.hotel.jpa.repositories")
@EnableTransactionManagement
public class JPAConfig {

	@Bean(name = "dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        dataSource.setDriverClassName(GeneralConfig.PROPERTY_NAME_DATABASE_DRIVER);
        dataSource.setUrl(GeneralConfig.PROPERTY_NAME_DATABASE_URL);
        dataSource.setUsername(GeneralConfig.PROPERTY_NAME_DATABASE_USERNAME);
        dataSource.setPassword(GeneralConfig.PROPERTY_NAME_DATABASE_PASSWORD);
        
        return dataSource;
	}

	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan(new String[] { "com.sunsoft.hotel.jpa.model" });
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setShowSql(GeneralConfig.PROPERTY_NAME_HIBERNATE_SHOW_SQL);
		factoryBean.setJpaVendorAdapter(vendorAdapter);
		return factoryBean;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

//	@Bean
//	public DozerBeanMapper getMapper() {
//		return new DozerBeanMapper();
//	}
}
