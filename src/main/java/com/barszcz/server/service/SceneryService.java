package com.barszcz.server.service;
import com.barszcz.server.entity.Hsv;
import com.barszcz.server.entity.Requests.SceneriesGetRequest;
import com.barszcz.server.entity.SceneryConfigurationModel;
import com.barszcz.server.entity.SceneryCreation;

import java.util.List;


public interface SceneryService {

    void addScenery(SceneryCreation sceneryCreation);

    void changeSceneryStatus(int sceneryID, SceneryConfigurationModel sceneryConfigurationModel) throws Exception;

    void validateSceneryByDeviceStatus(int deviceSerial, String deviceStatus, Hsv hsv, int roomID);

    void deleteScenery(int sceneryID);
}
