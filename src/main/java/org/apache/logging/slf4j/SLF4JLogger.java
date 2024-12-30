//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.apache.logging.slf4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.apache.logging.log4j.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.spi.LocationAwareLogger;

public class SLF4JLogger extends AbstractLogger {
    private static final long serialVersionUID = 1L;
    private static final boolean LAZY_LEVEL_CHECK = "ch.qos.logback.classic.LoggerContext".equals(LoggerFactory.getILoggerFactory().getClass().getName());
    private static final ThreadLocal<SLF4JLogBuilder> logBuilder = ThreadLocal.withInitial(SLF4JLogBuilder::new);
    private final Logger logger;
    private final LocationAwareLogger locationAwareLogger;

    public SLF4JLogger(final String name, final MessageFactory messageFactory, final Logger logger) {
        super(name, messageFactory);
        this.logger = logger;
        this.locationAwareLogger = logger instanceof LocationAwareLogger ? (LocationAwareLogger)logger : null;
    }

    public SLF4JLogger(final String name, final Logger logger) {
        super(name);
        this.logger = logger;
        this.locationAwareLogger = logger instanceof LocationAwareLogger ? (LocationAwareLogger)logger : null;
    }

    private int convertLevel(final Level level) {
        switch (level.getStandardLevel()) {
            case DEBUG:
                return 10;
            case TRACE:
                return 0;
            case INFO:
                return 20;
            case WARN:
                return 30;
            case ERROR:
                return 40;
            default:
                return 40;
        }
    }

    public Level getLevel() {
        if (this.logger.isTraceEnabled()) {
            return Level.TRACE;
        } else if (this.logger.isDebugEnabled()) {
            return Level.DEBUG;
        } else if (this.logger.isInfoEnabled()) {
            return Level.INFO;
        } else if (this.logger.isWarnEnabled()) {
            return Level.WARN;
        } else {
            return this.logger.isErrorEnabled() ? Level.ERROR : Level.OFF;
        }
    }

    public Logger getLogger() {
        return (Logger)(this.locationAwareLogger != null ? this.locationAwareLogger : this.logger);
    }

    private static Marker getMarker(final org.apache.logging.log4j.Marker marker) {
        return marker == null ? null : convertMarker(marker);
    }

    private static Marker convertMarker(final org.apache.logging.log4j.Marker marker) {
        Marker slf4jMarker = MarkerFactory.getMarker(marker.getName());
        org.apache.logging.log4j.Marker[] parents = marker.getParents();
        if (parents != null) {
            for(org.apache.logging.log4j.Marker parent : parents) {
                Marker slf4jParent = getMarker(parent);
                if (!slf4jMarker.contains(slf4jParent)) {
                    slf4jMarker.add(slf4jParent);
                }
            }
        }

        return slf4jMarker;
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final Message data, final Throwable t) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final CharSequence data, final Throwable t) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final Object data, final Throwable t) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String data) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String data, final Object... p1) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5, final Object p6, final Object p7, final Object p8, final Object p9) {
        return this.isEnabledFor(level, marker);
    }

    public boolean isEnabled(final Level level, final org.apache.logging.log4j.Marker marker, final String data, final Throwable t) {
        return this.isEnabledFor(level, marker);
    }

    private boolean isEnabledFor(final Level level, final org.apache.logging.log4j.Marker marker) {
        Marker slf4jMarker = getMarker(marker);
        switch (level.getStandardLevel()) {
            case DEBUG:
                return this.logger.isDebugEnabled(slf4jMarker);
            case TRACE:
                return this.logger.isTraceEnabled(slf4jMarker);
            case INFO:
                return this.logger.isInfoEnabled(slf4jMarker);
            case WARN:
                return this.logger.isWarnEnabled(slf4jMarker);
            case ERROR:
                return this.logger.isErrorEnabled(slf4jMarker);
            default:
                return this.logger.isErrorEnabled(slf4jMarker);
        }
    }

    public void logMessage(final String fqcn, final Level level, final org.apache.logging.log4j.Marker marker, final Message message, final Throwable t) {
        Marker slf4jMarker = getMarker(marker);
        String formattedMessage = message.getFormattedMessage();
        if (this.locationAwareLogger != null) {
            if (message instanceof LoggerNameAwareMessage) {
                ((LoggerNameAwareMessage)message).setLoggerName(this.getName());
            }

            this.locationAwareLogger.log(slf4jMarker, fqcn, this.convertLevel(level), formattedMessage, (Object[])null, t);
        } else {
            switch (level.getStandardLevel()) {
                case DEBUG:
                    this.logger.debug(slf4jMarker, formattedMessage, t);
                    break;
                case TRACE:
                    this.logger.trace(slf4jMarker, formattedMessage, t);
                    break;
                case INFO:
                    this.logger.info(slf4jMarker, formattedMessage, t);
                    break;
                case WARN:
                    this.logger.warn(slf4jMarker, formattedMessage, t);
                    break;
                case ERROR:
                    this.logger.error(slf4jMarker, formattedMessage, t);
                    break;
                default:
                    this.logger.error(slf4jMarker, formattedMessage, t);
            }
        }

    }

    public LogBuilder always() {
        return this.atLevel(Level.OFF);
    }

    public LogBuilder atTrace() {
        return this.atLevel(Level.TRACE);
    }

    public LogBuilder atDebug() {
        return this.atLevel(Level.DEBUG);
    }

    public LogBuilder atInfo() {
        return this.atLevel(Level.INFO);
    }

    public LogBuilder atWarn() {
        return this.atLevel(Level.WARN);
    }

    public LogBuilder atError() {
        return this.atLevel(Level.ERROR);
    }

    public LogBuilder atFatal() {
        return this.atLevel(Level.TRACE);
    }

    protected LogBuilder getLogBuilder(final Level level) {
        SLF4JLogBuilder builder = (SLF4JLogBuilder)logBuilder.get();
        return (LogBuilder)(Constants.ENABLE_THREADLOCALS && !builder.isInUse() ? builder.reset(this, level) : new SLF4JLogBuilder(this, level));
    }

    public LogBuilder atLevel(final Level level) {
        return LAZY_LEVEL_CHECK ? this.getLogBuilder(level) : super.atLevel(level);
    }
}
