package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 宿舍房间
 */
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//
//@TableName(value = "dorm_room")
public class DormRoom {

    @TableId(value = "dormroom_id")
    private Integer dormRoomId;
    @TableField("dormbuild_id")
    private int dormBuildId;
    @TableField("floor_num")
    private int floorNum;
    @TableField("max_capacity")
    private int maxCapacity;
    @TableField("current_capacity")
    private int currentCapacity;
    @TableField("first_bed")
    private String firstBed;
    @TableField("second_bed")
    private String secondBed;
    @TableField("third_bed")
    private String thirdBed;
    @TableField("fourth_bed")
    private String fourthBed;

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public int getDormBuildId() {
        return dormBuildId;
    }

    public Integer getDormRoomId() {
        return dormRoomId;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getFirstBed() {
        return firstBed;
    }

    public String getSecondBed() {
        return secondBed;
    }

    public String getThirdBed() {
        return thirdBed;
    }

    public String getFourthBed() {
        return fourthBed;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void setDormBuildId(int dormBuildId) {
        this.dormBuildId = dormBuildId;
    }

    public void setDormRoomId(Integer dormRoomId) {
        this.dormRoomId = dormRoomId;
    }

    public void setFirstBed(String firstBed) {
        this.firstBed = firstBed;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public void setFourthBed(String fourthBed) {
        this.fourthBed = fourthBed;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setSecondBed(String secondBed) {
        this.secondBed = secondBed;
    }

    public void setThirdBed(String thirdBed) {
        this.thirdBed = thirdBed;
    }
}
