/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using FileParameter = Org.OpenAPITools.Client.FileParameter;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using System.Reflection;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Mammal
    /// </summary>
    [JsonConverter(typeof(MammalJsonConverter))]
    [DataContract(Name = "mammal")]
    public partial class Mammal : AbstractOpenAPISchema, IEquatable<Mammal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Mammal" /> class
        /// with the <see cref="Pig" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Pig.</param>
        public Mammal(Pig actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Mammal" /> class
        /// with the <see cref="Whale" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Whale.</param>
        public Mammal(Whale actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Mammal" /> class
        /// with the <see cref="Zebra" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Zebra.</param>
        public Mammal(Zebra actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(Pig))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(Whale))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(Zebra))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: Pig, Whale, Zebra");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `Pig`. If the actual instanct is not `Pig`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Pig</returns>
        public Pig GetPig()
        {
            return (Pig)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Whale`. If the actual instanct is not `Whale`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Whale</returns>
        public Whale GetWhale()
        {
            return (Whale)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Zebra`. If the actual instanct is not `Zebra`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Zebra</returns>
        public Zebra GetZebra()
        {
            return (Zebra)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Mammal {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, Mammal.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of Mammal
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of Mammal</returns>
        public static Mammal FromJson(string jsonString)
        {
            Mammal newMammal = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newMammal;
            }

            string discriminatorValue = JObject.Parse(jsonString)["className"].ToString();
            switch (discriminatorValue)
            {
                case "Pig":
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Pig>(jsonString, Mammal.AdditionalPropertiesSerializerSettings));
                    return newMammal;
                case "whale":
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Whale>(jsonString, Mammal.AdditionalPropertiesSerializerSettings));
                    return newMammal;
                case "zebra":
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Zebra>(jsonString, Mammal.AdditionalPropertiesSerializerSettings));
                    return newMammal;
                default:
                    System.Diagnostics.Debug.WriteLine(string.Format("Failed to lookup discriminator value `{0}` for Mammal. Possible values: Pig whale zebra", discriminatorValue));
                    break;
            }

            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Pig).GetProperty("AdditionalProperties") == null)
                {
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Pig>(jsonString, Mammal.SerializerSettings));
                }
                else
                {
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Pig>(jsonString, Mammal.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Pig");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Pig: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Whale).GetProperty("AdditionalProperties") == null)
                {
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Whale>(jsonString, Mammal.SerializerSettings));
                }
                else
                {
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Whale>(jsonString, Mammal.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Whale");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Whale: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Zebra).GetProperty("AdditionalProperties") == null)
                {
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Zebra>(jsonString, Mammal.SerializerSettings));
                }
                else
                {
                    newMammal = new Mammal(JsonConvert.DeserializeObject<Zebra>(jsonString, Mammal.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Zebra");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Zebra: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newMammal;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as Mammal).AreEqual;
        }

        /// <summary>
        /// Returns true if Mammal instances are equal
        /// </summary>
        /// <param name="input">Instance of Mammal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Mammal input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for Mammal
    /// </summary>
    public class MammalJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(Mammal).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return Mammal.FromJson(JObject.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
