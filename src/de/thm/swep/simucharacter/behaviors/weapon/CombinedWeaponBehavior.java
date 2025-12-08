package de.thm.swep.simucharacter.behaviors.weapon;

import java.util.List;

public class CombinedWeaponBehavior implements WeaponBehavior {
    private final List<WeaponBehavior> weaponBehaviors;

    public CombinedWeaponBehavior(List<WeaponBehavior> weaponBehaviors) {
        this.weaponBehaviors = weaponBehaviors;
    }

    @Override
    public void useWeapon() {
        for (int i = 0; i < weaponBehaviors.size(); i++) {
            System.out.print("[" + i + "]");
            weaponBehaviors.get(i).useWeapon();
        }
    }
}
