package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.AxeBehavior;
import de.thm.swep.simucharacter.behaviors.weapon.CombinedWeaponBehavior;
import de.thm.swep.simucharacter.behaviors.weapon.KnifeBehavior;

import java.util.List;

public class ThmStudent extends Character {
    public ThmStudent() {
        weaponBehavior = new CombinedWeaponBehavior(
            List.of(new AxeBehavior(), new KnifeBehavior())
        );
    }
}
