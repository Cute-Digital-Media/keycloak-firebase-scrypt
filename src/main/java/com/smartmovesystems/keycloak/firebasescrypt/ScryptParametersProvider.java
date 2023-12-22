package com.smartmovesystems.keycloak.firebasescrypt;

import jakarta.persistence.NoResultException;
import org.keycloak.provider.Provider;

import java.util.List;

public interface ScryptParametersProvider extends Provider {
    ScryptHashParametersRepresentation addParameters(ScryptHashParametersRepresentation rep);
    ScryptHashParametersRepresentation getHashParametersById(String parametersId);
    ScryptHashParametersRepresentation getDefaultParameters() throws NoResultException;
    List<ScryptHashParametersRepresentation> getAllParameters();
}
