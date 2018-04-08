## Mimimal Example of ClassCastException

### Failure Running Gradle 4.6 JUnit5 Support
`./gradlew test`

Output:

    java.lang.ClassCastException: slf4j.api@1.7.25/org.slf4j.helpers.NOPLoggerFactory cannot be cast to org.gradle.internal.logging.slf4j.OutputEventListenerBackedLoggerContext
    
## Success Running Deprecated JUnit Platform Plugin
`./gradlew build -b build-junit-platform-plugin.gradle`

Output:

    BUILD SUCCESSFUL in 6s

### Description of Issue

*  It appears that there is an issue with `JUnitPlatform.class` in the JPMS.
*  Using the JUnit4 `@RunWith(JUnitPlatform.class)` annotation will also produce the exception. 

### About the Test Code
*  The test code is very basic and does nothing other than depend on code that uses the `slf4j-api`.
