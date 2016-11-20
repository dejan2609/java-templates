environments {
    dev {
        server {
            url = 'jdbc:postgresql://localhost:32769/flyway'
            user = 'postgres'
            password = 'postgres'
        }

        app {
            compilePropertyFile = 'compile-dev.properties'
        }
    }

    interserv {
        server {
            url = 'jdbc:postgresql://localhost:5432/flyway'
            user = 'postgres'
            password = 'postgres'
        }

        app {
            compilePropertyFile = 'compile-prod.properties'
        }
    }
}