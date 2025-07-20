package co.za.mazimuhlari.qinile.repositories;

import co.za.mazimuhlari.qinile.models.BaseModel;

import java.util.List;

public interface DataRepository<M extends BaseModel, ID> {
    boolean Exists();
    M GetObject();
    List<M> GetObjects();
    M GetObjectById(ID id);
    M SaveObject(M obj);
    List<M> SaveObjects(List<M> objs);
    int UpdateObject(M obj);
    int UpdateObjects(List<M> objs);
    int DeleteObject(ID id);
    int DeleteObjects(List<ID> ids);
}
