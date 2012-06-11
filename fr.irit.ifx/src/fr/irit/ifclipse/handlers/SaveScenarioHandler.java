package fr.irit.ifclipse.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;

import fr.irit.ifclipse.model.ModelRepo;

public class SaveScenarioHandler extends AbstractHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		return SaveHandlerUtil.save(ModelRepo.SCENARIO_MODEL_NS_URI, event);

	}

}
