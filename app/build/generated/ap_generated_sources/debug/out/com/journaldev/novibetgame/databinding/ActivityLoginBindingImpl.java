package com.journaldev.novibetgame.databinding;
import com.journaldev.novibetgame.R;
import com.journaldev.novibetgame.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.journaldev.novibetgame.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.support.design.widget.TextInputLayout mboundView1;
    @NonNull
    private final android.support.design.widget.TextInputLayout mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener inEmailandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.email.getValue()
            //         is loginViewModel.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(inEmail);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.email
            android.arch.lifecycle.MutableLiveData<java.lang.String> loginViewModelEmail = null;
            // loginViewModel.email != null
            boolean loginViewModelEmailJavaLangObjectNull = false;
            // loginViewModel.email.getValue()
            java.lang.String loginViewModelEmailGetValue = null;
            // loginViewModel
            gr.nikolis.novibetgame.viemodels.LoginViewModel loginViewModel = mLoginViewModel;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelEmail = loginViewModel.email;

                loginViewModelEmailJavaLangObjectNull = (loginViewModelEmail) != (null);
                if (loginViewModelEmailJavaLangObjectNull) {




                    loginViewModelEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener inPasswordandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginViewModel.password.getValue()
            //         is loginViewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(inPassword);
            // localize variables for thread safety
            // loginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // loginViewModel.password
            android.arch.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
            // loginViewModel.password.getValue()
            java.lang.String loginViewModelPasswordGetValue = null;
            // loginViewModel
            gr.nikolis.novibetgame.viemodels.LoginViewModel loginViewModel = mLoginViewModel;
            // loginViewModel.password != null
            boolean loginViewModelPasswordJavaLangObjectNull = false;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelPassword = loginViewModel.password;

                loginViewModelPasswordJavaLangObjectNull = (loginViewModelPassword) != (null);
                if (loginViewModelPasswordJavaLangObjectNull) {




                    loginViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[4]
            , (android.widget.ProgressBar) bindings[6]
            );
        this.button.setTag(null);
        this.inEmail.setTag(null);
        this.inPassword.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.design.widget.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.support.design.widget.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.journaldev.novibetgame.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((gr.nikolis.novibetgame.viemodels.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable gr.nikolis.novibetgame.viemodels.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelBusy((android.arch.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelErrorName((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeLoginViewModelEmail((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeLoginViewModelPassword((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeLoginViewModelErrorPassword((android.arch.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelBusy(android.arch.lifecycle.MutableLiveData<java.lang.Integer> LoginViewModelBusy, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelErrorName(android.arch.lifecycle.MutableLiveData<java.lang.String> LoginViewModelErrorName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelEmail(android.arch.lifecycle.MutableLiveData<java.lang.String> LoginViewModelEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelPassword(android.arch.lifecycle.MutableLiveData<java.lang.String> LoginViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelErrorPassword(android.arch.lifecycle.MutableLiveData<java.lang.String> LoginViewModelErrorPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int androidDatabindingViewDataBindingSafeUnboxLoginViewModelBusyGetValue = 0;
        java.lang.String loginViewModelPasswordGetValue = null;
        java.lang.Integer loginViewModelBusyGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Integer> loginViewModelBusy = null;
        java.lang.String loginViewModelErrorNameGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> loginViewModelErrorName = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> loginViewModelEmail = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
        android.arch.lifecycle.MutableLiveData<java.lang.String> loginViewModelErrorPassword = null;
        java.lang.String loginViewModelEmailGetValue = null;
        java.lang.String loginViewModelErrorPasswordGetValue = null;
        gr.nikolis.novibetgame.viemodels.LoginViewModel loginViewModel = mLoginViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.busy
                        loginViewModelBusy = loginViewModel.getBusy();
                    }
                    updateLiveDataRegistration(0, loginViewModelBusy);


                    if (loginViewModelBusy != null) {
                        // read loginViewModel.busy.getValue()
                        loginViewModelBusyGetValue = loginViewModelBusy.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(loginViewModel.busy.getValue())
                    androidDatabindingViewDataBindingSafeUnboxLoginViewModelBusyGetValue = android.databinding.ViewDataBinding.safeUnbox(loginViewModelBusyGetValue);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.errorName
                        loginViewModelErrorName = loginViewModel.errorName;
                    }
                    updateLiveDataRegistration(1, loginViewModelErrorName);


                    if (loginViewModelErrorName != null) {
                        // read loginViewModel.errorName.getValue()
                        loginViewModelErrorNameGetValue = loginViewModelErrorName.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.email
                        loginViewModelEmail = loginViewModel.email;
                    }
                    updateLiveDataRegistration(2, loginViewModelEmail);


                    if (loginViewModelEmail != null) {
                        // read loginViewModel.email.getValue()
                        loginViewModelEmailGetValue = loginViewModelEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.password
                        loginViewModelPassword = loginViewModel.password;
                    }
                    updateLiveDataRegistration(3, loginViewModelPassword);


                    if (loginViewModelPassword != null) {
                        // read loginViewModel.password.getValue()
                        loginViewModelPasswordGetValue = loginViewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (loginViewModel != null) {
                        // read loginViewModel.errorPassword
                        loginViewModelErrorPassword = loginViewModel.errorPassword;
                    }
                    updateLiveDataRegistration(4, loginViewModelErrorPassword);


                    if (loginViewModelErrorPassword != null) {
                        // read loginViewModel.errorPassword.getValue()
                        loginViewModelErrorPasswordGetValue = loginViewModelErrorPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.button.setOnClickListener(mCallback1);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inEmail, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inEmailandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.inPassword, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, inPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inEmail, loginViewModelEmailGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.inPassword, loginViewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.mboundView1.setError(loginViewModelErrorNameGetValue);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.mboundView3.setError(loginViewModelErrorPasswordGetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.progressBar.setVisibility(androidDatabindingViewDataBindingSafeUnboxLoginViewModelBusyGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loginViewModel != null
        boolean loginViewModelJavaLangObjectNull = false;
        // loginViewModel
        gr.nikolis.novibetgame.viemodels.LoginViewModel loginViewModel = mLoginViewModel;



        loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
        if (loginViewModelJavaLangObjectNull) {


            loginViewModel.onLoginClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel.busy
        flag 1 (0x2L): loginViewModel.errorName
        flag 2 (0x3L): loginViewModel.email
        flag 3 (0x4L): loginViewModel.password
        flag 4 (0x5L): loginViewModel.errorPassword
        flag 5 (0x6L): loginViewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}