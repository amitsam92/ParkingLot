/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot.vo;

/**
 *
 * @author samdarshi
 */
public class SlotVo {
    public int slotId;
    public String carNo;

    public SlotVo(int slotId, String carNo) {
        this.slotId = slotId;
        this.carNo = carNo;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public int getSlotId() {
        return slotId;
    }

    public String getCarNo() {
        return carNo;
    }
}
