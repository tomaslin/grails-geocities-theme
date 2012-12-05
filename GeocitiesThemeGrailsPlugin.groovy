class GeocitiesThemeGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "1.3 > *"
    def dependsOn = [:]
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Geocities Theme Plugin" // Headline display name of the plugin
    def author = "Tomas Lin"
    def authorEmail = "tomaslin@gmail.com"
    def description = '''\
Provides a Plugin Platform Theme based on old school geocity pages
'''

    def documentation = "http://grails.org/plugin/geocities-theme"
    def license = "APACHE"
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

	def doWithConfig = { config ->
    	platformUi {
        	themes.Geocities.ui.set = "Geocities"
    	}
	}

}
