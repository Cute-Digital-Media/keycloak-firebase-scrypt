plugins {
    java
}

group = "com.smartmovesystems.keycloak.firebasescrypt"
version = "3.0.3"

repositories {
    mavenCentral()
}

configurations {
    testImplementation.get().apply {
        extendsFrom(configurations.compileOnly.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    val scryptVersion = "1.4.0"
    val commonsCodecVersion = "1.13"
    val jbossLoggingVersion = "3.4.1.Final"
    val keycloakVersion = project.property("dependency.keycloak.version")
    val junitVersion = "4.13.1"

    // Scrypt
    implementation("com.lambdaworks:scrypt:$scryptVersion")
    //

    // Encoding
    implementation("commons-codec:commons-codec:$commonsCodecVersion")

    // JBoss
    compileOnly("org.jboss.logging:jboss-logging:$jbossLoggingVersion")

    // Keycloak
    compileOnly("org.keycloak:keycloak-common:$keycloakVersion")
    compileOnly("org.keycloak:keycloak-core:$keycloakVersion")
    compileOnly("org.keycloak:keycloak-server-spi:$keycloakVersion")
    compileOnly("org.keycloak:keycloak-model-jpa:$keycloakVersion")
    compileOnly("org.keycloak:keycloak-server-spi-private:$keycloakVersion")

    testImplementation("junit:junit:$junitVersion")
    testImplementation("org.keycloak:keycloak-common:$keycloakVersion")
    testImplementation("org.keycloak:keycloak-core:$keycloakVersion")
    testImplementation("org.keycloak:keycloak-server-spi:$keycloakVersion")
    testImplementation("org.keycloak:keycloak-model-jpa:$keycloakVersion")
    testImplementation("org.keycloak:keycloak-server-spi-private:$keycloakVersion")
    testImplementation("org.jboss.logging:jboss-logging:$jbossLoggingVersion")
}


tasks {
    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    jar {
        from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) }) {
            exclude("META-INF/MANIFEST.MF")
            exclude("META-INF/*.SF")
            exclude("META-INF/*.DSA")
            exclude("META-INF/*.RSA")
        }
    }

    wrapper {
        gradleVersion = "7.6"
    }

    test {
        useJUnitPlatform()
    }
}