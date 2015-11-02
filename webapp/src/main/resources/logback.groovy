import ch.qos.logback.classic.net.SyslogAppender

import static ch.qos.logback.classic.Level.INFO

def syslogSuffixPattern = "%thread %logger %msg"
appender("SYSLOG", SyslogAppender) {
    syslogHost = "cloudwatchlogs"
    port = 514
    facility = "user"
    suffixPattern = syslogSuffixPattern
    stackTracePattern = syslogStackTracePattern
}
root(INFO, ["SYSLOG"])




