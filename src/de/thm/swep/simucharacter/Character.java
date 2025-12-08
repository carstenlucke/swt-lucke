package de.thm.swep.simucharacter;

import de.thm.swep.simucharacter.behaviors.weapon.WeaponBehavior;

/**
 * Context-Klasse für das Strategy Pattern (Gang of Four).
 *
 * <p><b>Rolle im Pattern:</b> Context</p>
 *
 * <p>Diese Klasse repräsentiert einen Spielcharakter und verwendet das Strategy Pattern,
 * um das Kampfverhalten (Waffenverhalten) flexibel zu gestalten. Statt das Kampfverhalten
 * durch Vererbung fest zu codieren, wird es durch Komposition mit einer Strategy
 * (WeaponBehavior) realisiert.</p>
 *
 * <p><b>Vorteile des Strategy Patterns hier:</b></p>
 * <ul>
 *   <li>Das Kampfverhalten kann zur Laufzeit geändert werden</li>
 *   <li>Neue Waffenverhalten können hinzugefügt werden, ohne Character zu ändern</li>
 *   <li>Vermeidung von bedingten Anweisungen zur Auswahl des Verhaltens</li>
 *   <li>Bessere Testbarkeit durch Dependency Injection</li>
 * </ul>
 *
 * <p><b>Pattern-Struktur:</b></p>
 * <pre>
 * Character (Context)
 *   |
 *   +-- weaponBehavior : WeaponBehavior (Strategy Interface)
 *         |
 *         +-- AxeBehavior (Concrete Strategy)
 *         +-- BowAndArrowBehavior (Concrete Strategy)
 *         +-- KnifeBehavior (Concrete Strategy)
 *         +-- SwordBehavior (Concrete Strategy)
 * </pre>
 *
 * @see WeaponBehavior
 * @see de.thm.swep.simucharacter.behaviors.weapon.AxeBehavior
 * @see de.thm.swep.simucharacter.behaviors.weapon.BowAndArrowBehavior
 * @see de.thm.swep.simucharacter.behaviors.weapon.KnifeBehavior
 * @see de.thm.swep.simucharacter.behaviors.weapon.SwordBehavior
 */
public class Character {

    /**
     * Die aktuelle Kampfstrategie dieses Charakters.
     *
     * <p>Diese Referenz auf das Strategy Interface ermöglicht es,
     * das Verhalten zur Laufzeit auszutauschen, ohne die Character-Klasse
     * zu ändern (Open/Closed Principle).</p>
     */
    protected WeaponBehavior weaponBehavior;

    /**
     * Führt einen Kampf aus, indem die aktuelle Waffenstrategie verwendet wird.
     *
     * <p>Diese Methode delegiert die eigentliche Kampflogik an das
     * WeaponBehavior-Objekt. Dies ist ein zentrales Merkmal des Strategy Patterns:
     * Der Context kennt nur die Schnittstelle, nicht die konkrete Implementierung.</p>
     */
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
