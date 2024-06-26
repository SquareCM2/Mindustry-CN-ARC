package mindustry.arcModule.ui.auxilliary;

import arc.graphics.g2d.*;
import arc.scene.style.*;
import arc.scene.ui.layout.*;
import mindustry.gen.*;
import mindustry.ui.*;

import static mindustry.arcModule.ui.RStyles.*;

public abstract class BaseToolsTable extends Table{
    private boolean shown;
    private final Drawable icon;

    public BaseToolsTable(TextureRegion region){
        this(new TextureRegionDrawable(region));
    }

    public BaseToolsTable(Drawable icon){
        this.icon = icon;
    }

    public void addButton(Table buttons){
        buttons.button(icon(), clearAccentNoneTogglei, 30, this::toggle)
               .size(40).checked(b -> shown);
    }

    protected abstract void setup();

    public boolean shown(){
        return shown;
    }

    public boolean toggle(){
        return shown = !shown;
    }

    public Drawable icon(){
        return icon;
    }

}