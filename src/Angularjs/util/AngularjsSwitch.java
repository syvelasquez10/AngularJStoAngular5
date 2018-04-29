/**
 */
package Angularjs.util;

import Angularjs.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Angularjs.AngularjsPackage
 * @generated
 */
public class AngularjsSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AngularjsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularjsSwitch() {
		if (modelPackage == null) {
			modelPackage = AngularjsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AngularjsPackage.ANGULAR_JS_APP: {
				AngularJSApp angularJSApp = (AngularJSApp)theEObject;
				Object result = caseAngularJSApp(angularJSApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				Object result = caseTemplate(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.SETENCIA_HTML: {
				SetenciaHTML setenciaHTML = (SetenciaHTML)theEObject;
				Object result = caseSetenciaHTML(setenciaHTML);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.MARK_UP: {
				MarkUp markUp = (MarkUp)theEObject;
				Object result = caseMarkUp(markUp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.DIRECTIVA: {
				Directiva directiva = (Directiva)theEObject;
				Object result = caseDirectiva(directiva);
				if (result == null) result = caseMarkUp(directiva);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.CURLY_BRACES: {
				CurlyBraces curlyBraces = (CurlyBraces)theEObject;
				Object result = caseCurlyBraces(curlyBraces);
				if (result == null) result = caseMarkUp(curlyBraces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.EXPRESION: {
				Expresion expresion = (Expresion)theEObject;
				Object result = caseExpresion(expresion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.FILTRO: {
				Filtro filtro = (Filtro)theEObject;
				Object result = caseFiltro(filtro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.REFERENCIA: {
				Referencia referencia = (Referencia)theEObject;
				Object result = caseReferencia(referencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				Object result = caseController(controller);
				if (result == null) result = caseObjetoJavaScript(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.PROPIEDAD: {
				Propiedad propiedad = (Propiedad)theEObject;
				Object result = casePropiedad(propiedad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.MODULE: {
				Module module = (Module)theEObject;
				Object result = caseModule(module);
				if (result == null) result = caseObjetoJavaScript(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.SERVICE: {
				Service service = (Service)theEObject;
				Object result = caseService(service);
				if (result == null) result = caseObjetoJavaScript(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.FUNCION: {
				Funcion funcion = (Funcion)theEObject;
				Object result = caseFuncion(funcion);
				if (result == null) result = caseObjetoJavaScript(funcion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.PARAMETRO: {
				Parametro parametro = (Parametro)theEObject;
				Object result = caseParametro(parametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.OBJETO_JAVA_SCRIPT: {
				ObjetoJavaScript objetoJavaScript = (ObjetoJavaScript)theEObject;
				Object result = caseObjetoJavaScript(objetoJavaScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AngularjsPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				Object result = caseVariable(variable);
				if (result == null) result = caseObjetoJavaScript(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angular JS App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angular JS App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAngularJSApp(AngularJSApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setencia HTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setencia HTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSetenciaHTML(SetenciaHTML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark Up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark Up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMarkUp(MarkUp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directiva</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directiva</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDirectiva(Directiva object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curly Braces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curly Braces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCurlyBraces(CurlyBraces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpresion(Expresion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFiltro(Filtro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReferencia(Referencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propiedad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propiedad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropiedad(Propiedad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFuncion(Funcion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParametro(Parametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objeto Java Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objeto Java Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseObjetoJavaScript(ObjetoJavaScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //AngularjsSwitch
