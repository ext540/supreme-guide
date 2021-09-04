dependencies {
    implementation(project(":core"))

    implementation("org.bstats:bstats-velocity:2.2.1")
    implementation("mysql:mysql-connector-java:8.0.26")
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")

    compileOnly("com.velocitypowered:velocity-api:3.0.0")
    annotationProcessor("com.velocitypowered:velocity-api:3.0.0")
}

tasks {
    shadowJar {
        archiveFileName.set("EpicGuardVelocity-${project.version}.jar")
        relocate("org.bstats", "me.xneox.epicguard.velocity.bstats")
    }

    build {
        dependsOn(shadowJar)
    }
}