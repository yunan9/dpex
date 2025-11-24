plugins {
    `java-library`
}

repositories {
    mavenCentral()
    maven("https://central.sonatype.com/repository/maven-snapshots/")
}

dependencies {
    compileOnly(libs.yunan9.commons)
    compileOnly(libs.jetbrains.annotations)
}