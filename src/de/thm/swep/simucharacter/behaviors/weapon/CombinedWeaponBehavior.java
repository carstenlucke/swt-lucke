package de.thm.swep.simucharacter.behaviors.weapon;

import java.util.List;

public class CombinedWeaponBehavior implements WeaponBehavior {
    private final List<WeaponBehavior> weaponBehaviors;

    public CombinedWeaponBehavior(List<WeaponBehavior> weaponBehaviors) {
        this.weaponBehaviors = weaponBehaviors;
    }

    @Override
    public void useWeapon() {
        for (WeaponBehavior behavior : weaponBehaviors) {
            behavior.useWeapon();
        }
    }
}
