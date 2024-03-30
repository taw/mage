package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class OutlawsOfThunderJunction extends ExpansionSet {

    // This is a list of cards with the plot mechanic, it will be removed when the mechanic is implemented
    private static final List<String> unfinished = Arrays.asList("Aloe Alchemist", "Aven Interrupter", "Beastbond Outcaster", "Blacksnag Buzzard", "Brimstone Roundup", "Cunning Coyote", "Demonic Ruckus", "Djinn of Fool's Fall", "Doc Aurlock, Grizzled Genius", "Fblthp, Lost on the Range", "Irascible Wolverine", "Jace Reawakened", "Kellan Joins Up", "Lilah, Undefeated Slickshot", "Loan Shark", "Longhorn Sharpshooter", "Make Your Own Luck", "Outcaster Trailblazer", "Outlaw Stitcher", "Pillage the Bog", "Pitiless Carnage", "Plan the Heist", "Railway Brawler", "Rictus Robber", "Rise of the Varmints", "Sheriff of Safe Passage", "Slickshot Lockpicker", "Slickshot Show-Off", "Step Between Worlds", "Stingerback Terror", "Tumbleweed Rising", "Unscrupulous Contractor", "Visage Bandit");
    private static final OutlawsOfThunderJunction instance = new OutlawsOfThunderJunction();

    public static OutlawsOfThunderJunction getInstance() {
        return instance;
    }

    private OutlawsOfThunderJunction() {
        super("Outlaws of Thunder Junction", "OTJ", ExpansionSet.buildDate(2024, 4, 19), SetType.EXPANSION);
        this.blockName = "Outlaws of Thunder Junction"; // for sorting in GUI
        this.hasBasicLands = true;
        this.hasBoosters = false; // temporary

        cards.add(new SetCardInfo("Abraded Bluffs", 251, Rarity.COMMON, mage.cards.a.AbradedBluffs.class));
        cards.add(new SetCardInfo("Archangel of Tithes", 2, Rarity.MYTHIC, mage.cards.a.ArchangelOfTithes.class));
        cards.add(new SetCardInfo("Arid Archway", 252, Rarity.UNCOMMON, mage.cards.a.AridArchway.class));
        cards.add(new SetCardInfo("Armored Armadillo", 3, Rarity.COMMON, mage.cards.a.ArmoredArmadillo.class));
        cards.add(new SetCardInfo("At Knifepoint", 193, Rarity.UNCOMMON, mage.cards.a.AtKnifepoint.class));
        cards.add(new SetCardInfo("Badlands Revival", 194, Rarity.UNCOMMON, mage.cards.b.BadlandsRevival.class));
        cards.add(new SetCardInfo("Bandit's Haul", 240, Rarity.UNCOMMON, mage.cards.b.BanditsHaul.class));
        cards.add(new SetCardInfo("Beastbond Outcaster", 154, Rarity.UNCOMMON, mage.cards.b.BeastbondOutcaster.class));
        cards.add(new SetCardInfo("Blacksnag Buzzard", 79, Rarity.COMMON, mage.cards.b.BlacksnagBuzzard.class));
        cards.add(new SetCardInfo("Blood Hustler", 80, Rarity.UNCOMMON, mage.cards.b.BloodHustler.class));
        cards.add(new SetCardInfo("Blooming Marsh", 266, Rarity.RARE, mage.cards.b.BloomingMarsh.class));
        cards.add(new SetCardInfo("Boom Box", 241, Rarity.UNCOMMON, mage.cards.b.BoomBox.class));
        cards.add(new SetCardInfo("Botanical Sanctum", 267, Rarity.RARE, mage.cards.b.BotanicalSanctum.class));
        cards.add(new SetCardInfo("Bovine Intervention", 6, Rarity.UNCOMMON, mage.cards.b.BovineIntervention.class));
        cards.add(new SetCardInfo("Bridled Bighorn", 7, Rarity.COMMON, mage.cards.b.BridledBighorn.class));
        cards.add(new SetCardInfo("Brimstone Roundup", 115, Rarity.UNCOMMON, mage.cards.b.BrimstoneRoundup.class));
        cards.add(new SetCardInfo("Bristlepack Sentry", 156, Rarity.COMMON, mage.cards.b.BristlepackSentry.class));
        cards.add(new SetCardInfo("Bristling Backwoods", 253, Rarity.COMMON, mage.cards.b.BristlingBackwoods.class));
        cards.add(new SetCardInfo("Bristly Bill, Spine Sower", 157, Rarity.MYTHIC, mage.cards.b.BristlyBillSpineSower.class));
        cards.add(new SetCardInfo("Bruse Tarl, Roving Rancher", 198, Rarity.RARE, mage.cards.b.BruseTarlRovingRancher.class));
        cards.add(new SetCardInfo("Cactarantula", 158, Rarity.COMMON, mage.cards.c.Cactarantula.class));
        cards.add(new SetCardInfo("Cactusfolk Sureshot", 199, Rarity.UNCOMMON, mage.cards.c.CactusfolkSureshot.class));
        cards.add(new SetCardInfo("Canyon Crab", 40, Rarity.UNCOMMON, mage.cards.c.CanyonCrab.class));
        cards.add(new SetCardInfo("Colossal Rattlewurm", 159, Rarity.RARE, mage.cards.c.ColossalRattlewurm.class));
        cards.add(new SetCardInfo("Concealed Courtyard", 268, Rarity.RARE, mage.cards.c.ConcealedCourtyard.class));
        cards.add(new SetCardInfo("Creosote Heath", 255, Rarity.COMMON, mage.cards.c.CreosoteHeath.class));
        cards.add(new SetCardInfo("Cunning Coyote", 118, Rarity.UNCOMMON, mage.cards.c.CunningCoyote.class));
        cards.add(new SetCardInfo("Deepmuck Desperado", 42, Rarity.UNCOMMON, mage.cards.d.DeepmuckDesperado.class));
        cards.add(new SetCardInfo("Demonic Ruckus", 120, Rarity.UNCOMMON, mage.cards.d.DemonicRuckus.class));
        cards.add(new SetCardInfo("Desperate Bloodseeker", 86, Rarity.COMMON, mage.cards.d.DesperateBloodseeker.class));
        cards.add(new SetCardInfo("Discerning Peddler", 121, Rarity.COMMON, mage.cards.d.DiscerningPeddler.class));
        cards.add(new SetCardInfo("Djinn of Fool's Fall", 43, Rarity.COMMON, mage.cards.d.DjinnOfFoolsFall.class));
        cards.add(new SetCardInfo("Double Down", 44, Rarity.MYTHIC, mage.cards.d.DoubleDown.class));
        cards.add(new SetCardInfo("Duelist of the Mind", 45, Rarity.RARE, mage.cards.d.DuelistOfTheMind.class));
        cards.add(new SetCardInfo("Eriette's Lullaby", 10, Rarity.COMMON, mage.cards.e.EriettesLullaby.class));
        cards.add(new SetCardInfo("Eroded Canyon", 256, Rarity.COMMON, mage.cards.e.ErodedCanyon.class));
        cards.add(new SetCardInfo("Failed Fording", 47, Rarity.COMMON, mage.cards.f.FailedFording.class));
        cards.add(new SetCardInfo("Fake Your Own Death", 87, Rarity.COMMON, mage.cards.f.FakeYourOwnDeath.class));
        cards.add(new SetCardInfo("Ferocification", 123, Rarity.UNCOMMON, mage.cards.f.Ferocification.class));
        cards.add(new SetCardInfo("Festering Gulch", 257, Rarity.COMMON, mage.cards.f.FesteringGulch.class));
        cards.add(new SetCardInfo("Forest", 276, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forlorn Flats", 258, Rarity.COMMON, mage.cards.f.ForlornFlats.class));
        cards.add(new SetCardInfo("Form a Posse", 204, Rarity.UNCOMMON, mage.cards.f.FormAPosse.class));
        cards.add(new SetCardInfo("Forsaken Miner", 88, Rarity.UNCOMMON, mage.cards.f.ForsakenMiner.class));
        cards.add(new SetCardInfo("Freestrider Lookout", 163, Rarity.RARE, mage.cards.f.FreestriderLookout.class));
        cards.add(new SetCardInfo("Frontier Seeker", 13, Rarity.UNCOMMON, mage.cards.f.FrontierSeeker.class));
        cards.add(new SetCardInfo("Ghired, Mirror of the Wilds", 205, Rarity.MYTHIC, mage.cards.g.GhiredMirrorOfTheWilds.class));
        cards.add(new SetCardInfo("Gila Courser", 124, Rarity.UNCOMMON, mage.cards.g.GilaCourser.class));
        cards.add(new SetCardInfo("Gold Pan", 242, Rarity.COMMON, mage.cards.g.GoldPan.class));
        cards.add(new SetCardInfo("Gold Rush", 166, Rarity.UNCOMMON, mage.cards.g.GoldRush.class));
        cards.add(new SetCardInfo("Hardbristle Bandit", 168, Rarity.COMMON, mage.cards.h.HardbristleBandit.class));
        cards.add(new SetCardInfo("Hell to Pay", 126, Rarity.RARE, mage.cards.h.HellToPay.class));
        cards.add(new SetCardInfo("Hellspur Brute", 127, Rarity.UNCOMMON, mage.cards.h.HellspurBrute.class));
        cards.add(new SetCardInfo("Hellspur Posse Boss", 128, Rarity.RARE, mage.cards.h.HellspurPosseBoss.class));
        cards.add(new SetCardInfo("High Noon", 15, Rarity.RARE, mage.cards.h.HighNoon.class));
        cards.add(new SetCardInfo("Holy Cow", 16, Rarity.COMMON, mage.cards.h.HolyCow.class));
        cards.add(new SetCardInfo("Honest Rutstein", 207, Rarity.UNCOMMON, mage.cards.h.HonestRutstein.class));
        cards.add(new SetCardInfo("Inspiring Vantage", 269, Rarity.RARE, mage.cards.i.InspiringVantage.class));
        cards.add(new SetCardInfo("Intimidation Campaign", 208, Rarity.UNCOMMON, mage.cards.i.IntimidationCampaign.class));
        cards.add(new SetCardInfo("Intrepid Stablemaster", 169, Rarity.UNCOMMON, mage.cards.i.IntrepidStablemaster.class));
        cards.add(new SetCardInfo("Irascible Wolverine", 130, Rarity.COMMON, mage.cards.i.IrascibleWolverine.class));
        cards.add(new SetCardInfo("Island", 273, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jagged Barrens", 259, Rarity.COMMON, mage.cards.j.JaggedBarrens.class));
        cards.add(new SetCardInfo("Jolene, Plundering Pugilist", 210, Rarity.UNCOMMON, mage.cards.j.JolenePlunderingPugilist.class));
        cards.add(new SetCardInfo("Kraum, Violent Cacophony", 214, Rarity.UNCOMMON, mage.cards.k.KraumViolentCacophony.class));
        cards.add(new SetCardInfo("Lavaspur Boots", 243, Rarity.UNCOMMON, mage.cards.l.LavaspurBoots.class));
        cards.add(new SetCardInfo("Loan Shark", 55, Rarity.COMMON, mage.cards.l.LoanShark.class));
        cards.add(new SetCardInfo("Lonely Arroyo", 260, Rarity.COMMON, mage.cards.l.LonelyArroyo.class));
        cards.add(new SetCardInfo("Lush Oasis", 261, Rarity.COMMON, mage.cards.l.LushOasis.class));
        cards.add(new SetCardInfo("Magda, the Hoardmaster", 133, Rarity.RARE, mage.cards.m.MagdaTheHoardmaster.class));
        cards.add(new SetCardInfo("Malcolm, the Eyes", 219, Rarity.RARE, mage.cards.m.MalcolmTheEyes.class));
        cards.add(new SetCardInfo("Map the Frontier", 170, Rarity.UNCOMMON, mage.cards.m.MapTheFrontier.class));
        cards.add(new SetCardInfo("Marauding Sphinx", 56, Rarity.UNCOMMON, mage.cards.m.MaraudingSphinx.class));
        cards.add(new SetCardInfo("Marchesa, Dealer of Death", 220, Rarity.RARE, mage.cards.m.MarchesaDealerOfDeath.class));
        cards.add(new SetCardInfo("Mine Raider", 135, Rarity.COMMON, mage.cards.m.MineRaider.class));
        cards.add(new SetCardInfo("Miriam, Herd Whisperer", 221, Rarity.UNCOMMON, mage.cards.m.MiriamHerdWhisperer.class));
        cards.add(new SetCardInfo("Mountain", 275, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Neutralize the Guards", 95, Rarity.UNCOMMON, mage.cards.n.NeutralizeTheGuards.class));
        cards.add(new SetCardInfo("Nimble Brigand", 58, Rarity.UNCOMMON, mage.cards.n.NimbleBrigand.class));
        cards.add(new SetCardInfo("Oasis Gardener", 246, Rarity.COMMON, mage.cards.o.OasisGardener.class));
        cards.add(new SetCardInfo("Oko, the Ringleader", 223, Rarity.MYTHIC, mage.cards.o.OkoTheRingleader.class));
        cards.add(new SetCardInfo("Omenport Vigilante", 21, Rarity.UNCOMMON, mage.cards.o.OmenportVigilante.class));
        cards.add(new SetCardInfo("Outcaster Trailblazer", 173, Rarity.RARE, mage.cards.o.OutcasterTrailblazer.class));
        cards.add(new SetCardInfo("Outlaw Stitcher", 59, Rarity.UNCOMMON, mage.cards.o.OutlawStitcher.class));
        cards.add(new SetCardInfo("Peerless Ropemaster", 60, Rarity.COMMON, mage.cards.p.PeerlessRopemaster.class));
        cards.add(new SetCardInfo("Pillage the Bog", 224, Rarity.RARE, mage.cards.p.PillageTheBog.class));
        cards.add(new SetCardInfo("Plains", 272, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plan the Heist", 62, Rarity.UNCOMMON, mage.cards.p.PlanTheHeist.class));
        cards.add(new SetCardInfo("Prosperity Tycoon", 25, Rarity.UNCOMMON, mage.cards.p.ProsperityTycoon.class));
        cards.add(new SetCardInfo("Quilled Charger", 139, Rarity.COMMON, mage.cards.q.QuilledCharger.class));
        cards.add(new SetCardInfo("Railway Brawler", 175, Rarity.MYTHIC, mage.cards.r.RailwayBrawler.class));
        cards.add(new SetCardInfo("Rakish Crew", 99, Rarity.UNCOMMON, mage.cards.r.RakishCrew.class));
        cards.add(new SetCardInfo("Rattleback Apothecary", 100, Rarity.UNCOMMON, mage.cards.r.RattlebackApothecary.class));
        cards.add(new SetCardInfo("Raucous Entertainer", 177, Rarity.UNCOMMON, mage.cards.r.RaucousEntertainer.class));
        cards.add(new SetCardInfo("Raven of Fell Omens", 101, Rarity.COMMON, mage.cards.r.RavenOfFellOmens.class));
        cards.add(new SetCardInfo("Razzle-Dazzler", 63, Rarity.COMMON, mage.cards.r.RazzleDazzler.class));
        cards.add(new SetCardInfo("Reach for the Sky", 178, Rarity.COMMON, mage.cards.r.ReachForTheSky.class));
        cards.add(new SetCardInfo("Reckless Lackey", 140, Rarity.COMMON, mage.cards.r.RecklessLackey.class));
        cards.add(new SetCardInfo("Redrock Sentinel", 247, Rarity.UNCOMMON, mage.cards.r.RedrockSentinel.class));
        cards.add(new SetCardInfo("Resilient Roadrunner", 141, Rarity.UNCOMMON, mage.cards.r.ResilientRoadrunner.class));
        cards.add(new SetCardInfo("Rictus Robber", 102, Rarity.UNCOMMON, mage.cards.r.RictusRobber.class));
        cards.add(new SetCardInfo("Rise of the Varmints", 179, Rarity.UNCOMMON, mage.cards.r.RiseOfTheVarmints.class));
        cards.add(new SetCardInfo("Rooftop Assassin", 103, Rarity.COMMON, mage.cards.r.RooftopAssassin.class));
        cards.add(new SetCardInfo("Roxanne, Starfall Savant", 228, Rarity.RARE, mage.cards.r.RoxanneStarfallSavant.class));
        cards.add(new SetCardInfo("Ruthless Lawbringer", 229, Rarity.UNCOMMON, mage.cards.r.RuthlessLawbringer.class));
        cards.add(new SetCardInfo("Sandstorm Verge", 263, Rarity.UNCOMMON, mage.cards.s.SandstormVerge.class));
        cards.add(new SetCardInfo("Scorching Shot", 145, Rarity.UNCOMMON, mage.cards.s.ScorchingShot.class));
        cards.add(new SetCardInfo("Shackle Slinger", 65, Rarity.UNCOMMON, mage.cards.s.ShackleSlinger.class));
        cards.add(new SetCardInfo("Sheriff of Safe Passage", 29, Rarity.UNCOMMON, mage.cards.s.SheriffOfSafePassage.class));
        cards.add(new SetCardInfo("Shoot the Sheriff", 106, Rarity.UNCOMMON, mage.cards.s.ShootTheSheriff.class));
        cards.add(new SetCardInfo("Slickshot Lockpicker", 67, Rarity.UNCOMMON, mage.cards.s.SlickshotLockpicker.class));
        cards.add(new SetCardInfo("Slickshot Show-Off", 146, Rarity.RARE, mage.cards.s.SlickshotShowOff.class));
        cards.add(new SetCardInfo("Slickshot Vault-Buster", 68, Rarity.COMMON, mage.cards.s.SlickshotVaultBuster.class));
        cards.add(new SetCardInfo("Soured Springs", 264, Rarity.COMMON, mage.cards.s.SouredSprings.class));
        cards.add(new SetCardInfo("Spirebluff Canal", 270, Rarity.RARE, mage.cards.s.SpirebluffCanal.class));
        cards.add(new SetCardInfo("Spring Splasher", 69, Rarity.COMMON, mage.cards.s.SpringSplasher.class));
        cards.add(new SetCardInfo("Step Between Worlds", 70, Rarity.RARE, mage.cards.s.StepBetweenWorlds.class));
        cards.add(new SetCardInfo("Sterling Keykeeper", 32, Rarity.COMMON, mage.cards.s.SterlingKeykeeper.class));
        cards.add(new SetCardInfo("Stingerback Terror", 147, Rarity.RARE, mage.cards.s.StingerbackTerror.class));
        cards.add(new SetCardInfo("Swamp", 274, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Terror of the Peaks", 149, Rarity.MYTHIC, mage.cards.t.TerrorOfThePeaks.class));
        cards.add(new SetCardInfo("Tomb Trawler", 250, Rarity.UNCOMMON, mage.cards.t.TombTrawler.class));
        cards.add(new SetCardInfo("Trained Arynx", 36, Rarity.COMMON, mage.cards.t.TrainedArynx.class));
        cards.add(new SetCardInfo("Treasure Dredger", 110, Rarity.UNCOMMON, mage.cards.t.TreasureDredger.class));
        cards.add(new SetCardInfo("Tumbleweed Rising", 187, Rarity.COMMON, mage.cards.t.TumbleweedRising.class));
        cards.add(new SetCardInfo("Unscrupulous Contractor", 112, Rarity.UNCOMMON, mage.cards.u.UnscrupulousContractor.class));
        cards.add(new SetCardInfo("Vial Smasher, Gleeful Grenadier", 235, Rarity.UNCOMMON, mage.cards.v.VialSmasherGleefulGrenadier.class));
        cards.add(new SetCardInfo("Visage Bandit", 76, Rarity.UNCOMMON, mage.cards.v.VisageBandit.class));
        cards.add(new SetCardInfo("Voracious Varmint", 188, Rarity.COMMON, mage.cards.v.VoraciousVarmint.class));
        cards.add(new SetCardInfo("Vraska Joins Up", 236, Rarity.RARE, mage.cards.v.VraskaJoinsUp.class));
        cards.add(new SetCardInfo("Wanted Griffin", 38, Rarity.COMMON, mage.cards.w.WantedGriffin.class));
        cards.add(new SetCardInfo("Wrangler of the Damned", 238, Rarity.UNCOMMON, mage.cards.w.WranglerOfTheDamned.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is implemented
    }
}
