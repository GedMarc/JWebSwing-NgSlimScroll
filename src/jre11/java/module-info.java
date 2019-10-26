module com.jwebmp.plugins.ngslimscroll {

	exports com.jwebmp.plugins.ngslimscroll;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.ngslimscroll.NgSlimScrollPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.ngslimscroll.NgSlimScrollModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.ngslimscroll.implementations.NgSlimScrollExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.ngslimscroll.implementations.NgSlimScrollExclusionsModule;

	opens com.jwebmp.plugins.ngslimscroll to com.fasterxml.jackson.databind, com.jwebmp.core;
}
