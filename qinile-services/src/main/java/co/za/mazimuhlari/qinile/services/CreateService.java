package co.za.mazimuhlari.qinile.services;

import co.za.mazimuhlari.qinile.models.BaseModel;

public interface CreateService<M extends BaseModel, C> {
    M CreateItem(C item);
}
