package co.za.mazimuhlari.qinile.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseModel {
    private UUID id;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
