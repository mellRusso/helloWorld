package ShooterGame;

import ShooterGame.Weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new WaterPistol(),
                new BigGun(),
                new MachineGun(),
                new Pistol(),
                new RPG(),
                new Slingshot()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > getSlotsCount()) {
            System.out.println("Введенное значение больше чем количество слотов у игрока");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}
