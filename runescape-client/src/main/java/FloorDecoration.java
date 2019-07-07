import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("FloorDecoration")
public final class FloorDecoration {
   @ObfuscatedName("sm")
   @ObfuscatedSignature(
      signature = "Lg;"
   )
   @Export("grandExchangeEvents")
   static GrandExchangeEvents grandExchangeEvents;
   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = -1344682613
   )
   @Export("selectedSpellFlags")
   static int selectedSpellFlags;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = -5063688075016130813L
   )
   @Export("tag")
   public long tag;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1358154703
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1309467119
   )
   @Export("x")
   int x;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 318503957
   )
   @Export("y")
   int y;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lex;"
   )
   @Export("entity")
   public Entity entity;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1241982749
   )
   @Export("flags")
   int flags;

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;I)I",
      garbageValue = "-1749538901"
   )
   static int method2853(AbstractArchive var0, AbstractArchive var1) {
      int var2 = 0;
      if (var0.tryLoadFileByNames("title.jpg", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("logo", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("logo_deadman_mode", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("titlebox", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("titlebutton", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("runes", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("title_mute", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("options_radio_buttons,0", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("options_radio_buttons,2", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("options_radio_buttons,4", "")) {
         ++var2;
      }

      if (var1.tryLoadFileByNames("options_radio_buttons,6", "")) {
         ++var2;
      }

      var1.tryLoadFileByNames("sl_back", "");
      var1.tryLoadFileByNames("sl_flags", "");
      var1.tryLoadFileByNames("sl_arrows", "");
      var1.tryLoadFileByNames("sl_stars", "");
      var1.tryLoadFileByNames("sl_button", "");
      return var2;
   }
}
