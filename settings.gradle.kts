rootProject.name = "finanace"
include("api")
include("consumer")
include("gateway")
include("api:src:main:css")
findProject(":api:src:main:css")?.name = "css"
include("css")
include("domain")
