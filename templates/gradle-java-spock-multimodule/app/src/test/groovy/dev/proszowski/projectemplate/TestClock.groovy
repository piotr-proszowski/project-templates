package dev.proszowski.projectemplate

import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.ZoneId

class TestClock extends Clock {

    private Instant now = Instant.now()

    @Override
    ZoneId getZone() {
        throw new IllegalStateException("Unexpected call to withZone method")
    }

    @Override
    Clock withZone(ZoneId zone) {
        throw new IllegalStateException("Unexpected call to withZone method")
    }

    @Override
    Instant instant() {
        return now
    }

    Instant advanceTimeBy(Duration duration) {
        now += duration
    }
}
