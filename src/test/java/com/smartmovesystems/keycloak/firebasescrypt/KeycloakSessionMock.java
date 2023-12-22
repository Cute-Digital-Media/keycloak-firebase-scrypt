package com.smartmovesystems.keycloak.firebasescrypt;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.*;
import org.keycloak.policy.PasswordPolicyProvider;
import org.keycloak.provider.InvalidationHandler;
import org.keycloak.provider.Provider;
import org.keycloak.services.clientpolicy.ClientPolicyManager;
import org.keycloak.sessions.AuthenticationSessionProvider;
import org.keycloak.vault.VaultTranscriber;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class KeycloakSessionMock implements KeycloakSession {
    @Override
    public KeycloakContext getContext() {
        return null;
    }

    @Override
    public KeycloakTransactionManager getTransactionManager() {
        return null;
    }

    @Override
    public <T extends Provider> T getProvider(Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends Provider> T getProvider(Class<T> clazz, String id) {
        if (clazz == PasswordPolicyProvider.class) {
            return (T) new PasswordPolicyMockProvider();
        }
        return null;
    }

    @Override
    public <T extends Provider> T getComponentProvider(Class<T> aClass, String s) {
        return null;
    }

    @Override
    public <T extends Provider> T getComponentProvider(Class<T> aClass, String s, Function<KeycloakSessionFactory, ComponentModel> function) {
        return null;
    }

    @Override
    public <T extends Provider> T getProvider(Class<T> clazz, ComponentModel componentModel) {
        return null;
    }

    @Override
    public <T extends Provider> Set<String> listProviderIds(Class<T> clazz) {
        return null;
    }

    @Override
    public <T extends Provider> Set<T> getAllProviders(Class<T> clazz) {
        return null;
    }

    @Override
    public Class<? extends Provider> getProviderClass(String providerClassName) {
        return null;
    }

    @Override
    public Object getAttribute(String attribute) {
        return null;
    }

    @Override
    public <T> T getAttribute(String attribute, Class<T> clazz) {
        return null;
    }

    @Override
    public <T> T getAttributeOrDefault(String attribute, T defaultValue) {
        return null;
    }

    @Override
    public Object removeAttribute(String attribute) {
        return null;
    }

    @Override
    public void setAttribute(String name, Object value) {

    }

    @Override
    public Map<String, Object> getAttributes() {
        return null;
    }

    @Override
    public void invalidate(InvalidationHandler.InvalidableObjectType invalidableObjectType, Object... objects) {

    }

    @Override
    public void enlistForClose(Provider provider) {

    }

    @Override
    public KeycloakSessionFactory getKeycloakSessionFactory() {
        return null;
    }

    @Override
    public RealmProvider realms() {
        return null;
    }

    @Override
    public ClientProvider clients() {
        return null;
    }

    @Override
    public ClientScopeProvider clientScopes() {
        return null;
    }

    @Override
    public GroupProvider groups() {
        return null;
    }

    @Override
    public RoleProvider roles() {
        return null;
    }

    @Override
    public UserSessionProvider sessions() {
        return null;
    }

    @Override
    public UserLoginFailureProvider loginFailures() {
        return null;
    }

    @Override
    public AuthenticationSessionProvider authenticationSessions() {
        return null;
    }

    @Override
    public SingleUseObjectProvider singleUseObjects() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public UserProvider users() {
        return null;
    }

    @Override
    public KeyManager keys() {
        return null;
    }

    @Override
    public ThemeManager theme() {
        return null;
    }

    @Override
    public TokenManager tokens() {
        return null;
    }

    @Override
    public VaultTranscriber vault() {
        return null;
    }

    @Override
    public ClientPolicyManager clientPolicy() {
        return null;
    }
}
