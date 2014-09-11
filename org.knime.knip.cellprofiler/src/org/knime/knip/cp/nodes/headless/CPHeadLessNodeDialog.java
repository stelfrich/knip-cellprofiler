package org.knime.knip.cp.nodes.headless;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentColumnNameSelection;
import org.knime.core.node.defaultnodesettings.DialogComponentFileChooser;
import org.knime.knip.base.data.img.ImgPlusValue;

@SuppressWarnings("unchecked")
public class CPHeadLessNodeDialog extends DefaultNodeSettingsPane {

	{
		// path to cell profiler instance

		addDialogComponent(new DialogComponentFileChooser(
				CPHeadlessNodeModel.createPathToCPInstallationModel(),
				"Path to CellProfiler Installation"));

		addDialogComponent(new DialogComponentFileChooser(
				CPHeadlessNodeModel.createPathToCPProjectModel(),
				"Path to CellProfiler Project"));

		// column containing images
		addDialogComponent(new DialogComponentColumnNameSelection(
				CPHeadlessNodeModel.createImageColumnNameModel(),
				"Select Column Containing Images", 0, ImgPlusValue.class));

	}

}
