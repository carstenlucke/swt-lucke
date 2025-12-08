package de.thm.swep.simucharacter.behaviors.weapon;

/**
 * Concrete Strategy für das Strategy Pattern - implementiert das Messer-Kampfverhalten.
 *
 * <p><b>Rolle im Pattern:</b> Concrete Strategy</p>
 *
 * <p>Diese Klasse implementiert eine konkrete Strategie für das Waffenverhalten.
 * Sie kapselt den spezifischen Algorithmus für den Nahkampf mit einem Messer.</p>
 *
 * @see WeaponBehavior
 * @see de.thm.swep.simucharacter.Character
 */
public class KnifeBehavior implements WeaponBehavior {
    /**
     * Führt das Messer-Kampfverhalten aus.
     */
    @Override
    public void useWeapon() {
        System.out.println("Schneidet mit Messer.");
    }
}
