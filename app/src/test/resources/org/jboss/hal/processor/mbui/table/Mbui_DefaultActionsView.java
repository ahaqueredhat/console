package org.jboss.hal.processor.mbui.table;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.inject.Inject;

import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import elemental2.dom.HTMLElement;
import org.jboss.hal.core.mbui.MbuiContext;
import org.jboss.hal.core.mbui.table.ModelNodeTable;
import org.jboss.hal.meta.AddressTemplate;
import org.jboss.hal.meta.Metadata;
import org.jboss.hal.resources.Ids;

import static org.jboss.gwt.elemento.core.Elements.div;
import static org.jboss.hal.ballroom.LayoutBuilder.column;
import static org.jboss.hal.ballroom.LayoutBuilder.row;

/*
 * WARNING! This class is generated. Do not modify.
 */
@Generated("org.jboss.hal.processor.mbui.MbuiViewProcessor")
public final class Mbui_DefaultActionsView extends DefaultActionsView {

    private final Metadata metadata0;
    private final Map<String, HTMLElement> expressionElements;

    @Inject
    @SuppressWarnings("unchecked")
    public Mbui_DefaultActionsView(MbuiContext mbuiContext) {
        super(mbuiContext);

        AddressTemplate metadata0Template = AddressTemplate.of("/subsystem=foo");
        this.metadata0 = mbuiContext.metadataRegistry().lookup(metadata0Template);
        this.expressionElements = new HashMap<>();

        table = new ModelNodeTable.Builder<org.jboss.hal.dmr.NamedNode>("table", metadata0)
                .button(mbuiContext.tableButtonFactory().add(Ids.build("table", Ids.ADD), "Subsystem",
                        metadata0Template, (name, address) -> presenter.reload()))
                .button(mbuiContext.tableButtonFactory().remove("Subsystem", metadata0Template,
                        table -> table.selectedRow().getName(), () -> presenter.reload()))
                .columns("name")
                .build();

        HTMLElement html0;
        HTMLElement root = row()
                .add(column()
                        .add(html0 = div()
                                .innerHtml(SafeHtmlUtils.fromSafeConstant("<h1>Table</h1>"))
                                .get())
                        .add(table)
                )
                .get();
        expressionElements.put("html0", html0);

        registerAttachable(table);

        initElement(root);
    }

    @Override
    public void attach() {
        super.attach();
    }
}
