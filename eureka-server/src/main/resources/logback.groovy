import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.net.SyslogAppender
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.INFO

def syslogSuffixPattern = "eureka_server %thread %logger %msg"
def APP_PROFILE = System.getenv("SPRING_PROFILES_ACTIVE");
def targetAppender = "CONSOLE"

if ("syslog".equals(APP_PROFILE)) {
    appender("SYSLOG", SyslogAppender) {
        syslogHost = "logs"
        port = 514
        facility = "user"
        suffixPattern = syslogSuffixPattern
    }
    targetAppender = "SYSLOG"
} else {
    appender("CONSOLE", ConsoleAppender) {
        encoder(PatternLayoutEncoder) {
            pattern = "%d %5p | %t | %-55logger{55} | %m %n"
        }
    }
}
root(INFO, [targetAppender])