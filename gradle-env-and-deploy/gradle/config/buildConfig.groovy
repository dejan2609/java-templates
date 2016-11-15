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

    interserv01 {
        server {
            hostname = 'etalon.devalexb.com'
            port = 8080
            context = 'devalexb'
            username = 'tomcat'
            password = 'tomcat'
        }

        app {
            compilePropertyFile = 'compile-etalon.properties'
        }
    }

    interserv02 {
        server {
            hostname = 'prod.devalexb.com'
            port = 8080
            context = 'devalexb'
            username = 'tomcat'
            password = 'tomcat'
        }

        app {
            compilePropertyFile = 'compile-etalon.properties'
        }
    }
}