package com.automation.poc;

public class SelfHealingPrompts {

    // The universal master blueprint template stored inside our framework configuration
    public static final String LOCATOR_HEALING_TEMPLATE =
            "=== SYSTEM ROLE ===\n" +
                    "You are an expert QA Automation Agent specializing in Selenium Java.\n\n" +

                    "=== HISTORICAL CONTEXT FROM VECTOR DB ===\n" +
                    "{{VECTOR_DB_CONTEXT}}\n\n" +

                    "=== CURRENT LIVE BROKEN HTML ===\n" +
                    "{{LIVE_BROKEN_HTML}}\n\n" +

                    "=== CONSTRAINTS & INSTRUCTIONS ===\n" +
                    "1. Analyze the structural differences between the historical context and the live HTML.\n" +
                    "2. Identify the target element that changed.\n" +
                    "3. Prioritize ID, Name, or unique CSS Selector.\n" +
                    "4. STRICTLY FORBIDDEN: Do not use absolute XPaths under any circumstance.\n" +
                    "5. Output format: Return ONLY the raw Selenium Java locator syntax, for example: By.id(\"new-id\")\n" +
                    "6. Do not include any conversational filler, markdown block quotes, or explanations.";
}
