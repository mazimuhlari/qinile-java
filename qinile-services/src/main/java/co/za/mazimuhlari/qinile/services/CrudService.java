package co.za.mazimuhlari.qinile.services;

import co.za.mazimuhlari.qinile.models.BaseModel;

public interface CrudService<M extends BaseModel, C, ID, U> extends CreateService<M, C>, ReadService<M, ID>, UpdateService<M, U>, DeleteService<M, ID> {
}
