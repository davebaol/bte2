package io.piotrjastrzebski.bte.view;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.DragAndDrop;

/**
 * Created by EvilEntity on 05/02/2016.
 */
public abstract class ViewSource extends DragAndDrop.Source {
	public ViewSource (Actor actor) {
		super(actor);
	}
}
