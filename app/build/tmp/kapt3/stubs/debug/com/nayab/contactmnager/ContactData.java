package com.nayab.contactmnager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/nayab/contactmnager/ContactData;", "", "()V", "KEY_LIST", "", "PREFS_NAME", "contactList", "", "Lcom/nayab/contactmnager/Contact;", "getContactList", "()Ljava/util/List;", "load", "", "context", "Landroid/content/Context;", "save", "app_debug"})
public final class ContactData {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREFS_NAME = "contacts_prefs";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_LIST = "contacts_json";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.nayab.contactmnager.Contact> contactList = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.nayab.contactmnager.ContactData INSTANCE = null;
    
    private ContactData() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.nayab.contactmnager.Contact> getContactList() {
        return null;
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}