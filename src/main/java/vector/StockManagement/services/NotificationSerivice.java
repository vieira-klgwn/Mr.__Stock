package vector.StockManagement.services;


import vector.StockManagement.model.Notification;

import java.util.List;

public interface NotificationSerivice {
    List<Notification> findAll();
    Notification findById(Long id);
    Notification save(Notification notification);
    void delete(Long id);
}