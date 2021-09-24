version = "1.0.0"

project.extra["PluginName"] = "Chin"
project.extra["PluginDescription"] = "Chat filtering, Ctrl+V pasting, and retype previous message"
project.extra["ProjectSupportUrl"] = "https://github.com/Stylei30/stylei.git"

tasks {
    jar {
        manifest {
            attributes(mapOf(
                    "Plugin-Version" to project.version,
                    "Plugin-Id" to nameToId(project.extra["PluginName"] as String),
                    "Plugin-Provider" to project.extra["PluginProvider"],
                    "Plugin-Description" to project.extra["PluginDescription"],
                    "Plugin-License" to project.extra["PluginLicense"]
            ))
        }
    }
}
