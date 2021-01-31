SCRIPT_START
{
NOP
SCRIPT_NAME WUCHAR     //wu char selector

WAIT 0
LVAR_INT scplayer
LVAR_INT pmodel pmodel1 pmodel2 pmodel3 pmodel4 pmodel5 pmodel6 pmodel7 pmodel8 pmodel9 pmodel10
LVAR_INT foimudado uselast lastused charmenu selected skinpick skinblip pickmodel blipcolour
LVAR_FLOAT x y z
foimudado = 0

GET_PLAYER_CHAR 0 scplayer

//WRITE_INT_TO_INI_FILE pmodel "cleo\WuCharSelector.ini" "Log" "Model"
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "DefaultSkin" "Model" pmodel
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "DefaultSkin" "UseLast" uselast
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed" lastused
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Tweaks" "BlipColour" blipcolour
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Tweaks" "PickModel" pickmodel
    READ_FLOAT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Tweaks" "Coordx" x
    READ_FLOAT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Tweaks" "Coordy" y
    READ_FLOAT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Tweaks" "Coordz" z
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin1" "Model" pmodel1
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin2" "Model" pmodel2
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin3" "Model" pmodel3
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin4" "Model" pmodel4
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin5" "Model" pmodel5
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin6" "Model" pmodel6
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin7" "Model" pmodel7
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin8" "Model" pmodel8
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin9" "Model" pmodel9
    READ_INT_FROM_INI_FILE "cleo\WuCharSelector.ini" "Pskin" "Model" pmodel10
//

pickup:
WAIT 0
REQUEST_MODEL pickmodel                            //1275
CREATE_PICKUP pickmodel 3 x y z skinpick           //2521.5859, -1492.7120, 24.0700
ADD_BLIP_FOR_PICKUP skinpick skinblip
CHANGE_BLIP_COLOUR skinblip blipcolour

main_loop:
WAIT 0

IF HAS_MODEL_LOADED pmodel
    GOTO change_skin
ELSE
    REQUEST_MODEL pmodel
ENDIF

change_skin:
WAIT 0
IF foimudado = 0
    IF uselast = 0
            WAIT 1000
            SET_PLAYER_MODEL 0 pmodel
            foimudado = 1
            WRITE_INT_TO_INI_FILE pmodel "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
    ELSE
            pmodel = lastused
            REQUEST_MODEL pmodel
            WAIT 1000
            SET_PLAYER_MODEL 0 pmodel
            foimudado = 1
    ENDIF
ENDIF

WHILE TRUE
WAIT 0

    //IF IS_KEY_PRESSED VK_KEY_U
    IF HAS_PICKUP_BEEN_COLLECTED skinpick
        CREATE_MENU MENUNM (30.0 170.0) (280.0) 1 TRUE TRUE 0 (charmenu)
        SET_MENU_COLUMN charmenu 0 DUMMY (CHAR1 CHAR2 CHAR3 CHAR4 CHAR5 CHAR6 CHAR7 CHAR8 CHAR9 CHAR10 DUMMY DUMMY)

        WHILE TRUE
            WAIT 0

            SET_PLAYER_CONTROL 0 0
            IF IS_BUTTON_PRESSED PAD1 CROSS
                GET_MENU_ITEM_SELECTED charmenu (selected)
                SWITCH selected
                    CASE 0
                        REQUEST_MODEL pmodel1
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel1 
                        WRITE_INT_TO_INI_FILE pmodel1 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 1
                        REQUEST_MODEL pmodel2
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel2 
                        WRITE_INT_TO_INI_FILE pmodel2 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 2
                        REQUEST_MODEL pmodel3
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel3 
                        WRITE_INT_TO_INI_FILE pmodel3 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 3
                        REQUEST_MODEL pmodel4
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel4 
                        WRITE_INT_TO_INI_FILE pmodel4 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 4
                        REQUEST_MODEL pmodel5
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel5
                        WRITE_INT_TO_INI_FILE pmodel5 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 5
                        REQUEST_MODEL pmodel6
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel6 
                        WRITE_INT_TO_INI_FILE pmodel6 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 6
                        REQUEST_MODEL pmodel7
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel7 
                        WRITE_INT_TO_INI_FILE pmodel7 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 7
                        REQUEST_MODEL pmodel8
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel8 
                        WRITE_INT_TO_INI_FILE pmodel8 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                    CASE 8
                        REQUEST_MODEL pmodel9
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel9 
                        WRITE_INT_TO_INI_FILE pmodel9 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                     CASE 9
                        REQUEST_MODEL pmodel10
                        WAIT 1000
                        SET_PLAYER_MODEL 0 pmodel10 
                        WRITE_INT_TO_INI_FILE pmodel10 "cleo\WuCharSelector.ini" "DefaultSkin" "LastUsed"
                        BREAK
                ENDSWITCH
                BREAK
            ENDIF

            IF IS_BUTTON_PRESSED PAD1 TRIANGLE // action key
                BREAK
            ENDIF

        ENDWHILE

        DELETE_MENU charmenu
        SET_PLAYER_CONTROL 0 1
        WAIT 5000
        GOTO pickup
    ENDIF
ENDWHILE

GOTO main_loop
}
SCRIPT_END