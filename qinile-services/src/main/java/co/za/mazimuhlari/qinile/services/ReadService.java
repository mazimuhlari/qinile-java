package co.za.mazimuhlari.qinile.services;

import co.za.mazimuhlari.qinile.models.BaseModel;

import java.util.List;
import java.util.UUID;

public interface ReadService<M extends BaseModel, ID> {
    M GetItemById(ID id);
    List<M> GetItems();
}
