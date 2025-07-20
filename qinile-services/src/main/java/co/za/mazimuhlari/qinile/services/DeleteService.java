package co.za.mazimuhlari.qinile.services;

import co.za.mazimuhlari.qinile.models.BaseModel;

import java.util.UUID;

public interface DeleteService<M extends BaseModel, ID> {
    M DeleteItemById(ID id);
}
