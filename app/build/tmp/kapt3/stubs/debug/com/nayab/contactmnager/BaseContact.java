package com.nayab.contactmnager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0003J\b\u0010\u0010\u001a\u00020\u0003H&J\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/nayab/contactmnager/BaseContact;", "", "firstName", "", "lastName", "phone", "imageUri", "Landroid/net/Uri;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "getFirstName", "()Ljava/lang/String;", "getImageUri", "()Landroid/net/Uri;", "getLastName", "getPhone", "displayInfo", "getContactType", "getFirstInitial", "getName", "getPhoneNumber", "app_debug"})
public abstract class BaseContact {
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.NotNull()
    private final transient java.lang.String firstName = null;
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.NotNull()
    private final transient java.lang.String lastName = null;
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.NotNull()
    private final transient java.lang.String phone = null;
    @kotlin.jvm.Transient()
    @org.jetbrains.annotations.Nullable()
    private final transient android.net.Uri imageUri = null;
    
    public BaseContact(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.net.Uri getImageUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getContactType();
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstInitial() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String displayInfo() {
        return null;
    }
}