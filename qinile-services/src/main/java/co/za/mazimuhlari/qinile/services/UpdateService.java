package co.za.mazimuhlari.qinile.services;

import co.za.mazimuhlari.qinile.models.BaseModel;

public interface UpdateService<M extends BaseModel, U> {
    M UpdateItemAsync(U item);
}
