appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
  }
}

logger("nix", DEBUG, ["CONSOLE"], false)

root(DEBUG, ['CONSOLE'])
