environments {
    dev {
        server {
            hostname = 'localhost'
            port = 8080
            context = 'devalexb'
            username = 'tomcat'
            password = 'tomcat'
        }

        app {
            compilePropertyFile = 'compile-dev.properties'
        }
    }

    interserv {
        server {
            hostname = 'etalon.devalexb.com'
            port = 8080
            context = 'devalexb'
            username = 'tomcat'
            password = 'tomcat'
        }

        app {
            compilePropertyFile = 'compile-prod.properties'
        }
    }
}