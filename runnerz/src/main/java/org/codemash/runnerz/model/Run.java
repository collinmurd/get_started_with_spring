package org.codemash.runnerz.model;

import java.time.LocalDateTime;

// record is an Immutable type. Gives you getters, constructor, toString, etc automatically
public record Run(
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location location 
    ) {
    
}
