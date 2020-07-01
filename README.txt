# Wu-Char-Selector
Wu Char Selector is a "Char Selector" cleo mod for GTA San Andreas

How to use:

Go and catch the checkpoint (marked on map and with the location in the .ini file) to open the skin changer menu.
You can customize at your own with the:

-Ini file:
It's the configuration file,you can change what skin player will use in each slot,the default skin,pickup location,model and colour,etc.
Remember to put skin Id not dff name. Here you can see skins ids > https://wiki.sa-mp.com/wiki/Skins:All

[DefaultSkin]
Model =0          = The default skin model,player will spawn with this skin if "UseLast =0"
UseLast =0        = To start with the last skin used change this to 1
LastUsed =0       = The last skin that player used.

[Tweaks]
Coordx =2521.5859		 ;-\
Coordy =-1492.7120		;--| =Pickup coordinates
Coordz =24.0700			 ;-/
BlipColour =2			  =Pickup colour on the radar
PickModel =1275			=Pickup Model

[Pskin1]          = Slot 1
Model =0          = Slot 1 model

-fxt file:
Used to change the menu and menu itens name

MENUNM Select Character         = Menu name   (yes,you can translate it to indonesian...)
CHAR1 Sabo                      = First menu item name

-------------------------------------------------------------------------------------------------------------------
updated 1/7/20 = Now it works with pickup!!!!!!

