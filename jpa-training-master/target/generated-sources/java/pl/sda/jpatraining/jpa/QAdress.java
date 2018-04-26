package pl.sda.jpatraining.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdress is a Querydsl query type for Adress
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAdress extends BeanPath<Adress> {

    private static final long serialVersionUID = -143288174L;

    public static final QAdress adress = new QAdress("adress");

    public final StringPath city = createString("city");

    public final StringPath postalCode = createString("postalCode");

    public final StringPath street = createString("street");

    public QAdress(String variable) {
        super(Adress.class, forVariable(variable));
    }

    public QAdress(Path<? extends Adress> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdress(PathMetadata metadata) {
        super(Adress.class, metadata);
    }

}

